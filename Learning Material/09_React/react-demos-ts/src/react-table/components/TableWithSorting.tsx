import React from 'react';
import { useTable, useSortBy, Column } from 'react-table';

import './Table.css';

const TableWithSorting = ({ columns, data } : { columns : Column<object>[], data : any } ) => {
    /**
     * Pass in useSortBy hook as the second argument to useTable
     */
    const {
        getTableProps,
        getTableBodyProps,
        headerGroups,
        rows,
        prepareRow
    } = useTable(
        {
            columns,
            data
        },
        useSortBy
    );

    return (
        <table {...getTableProps()}>
            <thead>
                {
                    headerGroups.map(headerGroup => (
                        <tr {...headerGroup.getHeaderGroupProps()}>
                            {
                                headerGroup.headers.map(column => (
                                    /**
                                     * Pass in column.getSortByToggleProps() to getHeaderProps
                                     */
                                    <th {...column.getHeaderProps( column.getSortByToggleProps() )}>
                                        {column.render('Header')}
                                        <span>
                                            {
                                                /**
                                                 * Use column.isSorted and column.isSortedDesc to show &darr; or &uarr; (or nothing) as indicator
                                                 */
                                                column.isSorted ? (
                                                    column.isSortedDesc ? (
                                                        <span>&darr;</span>
                                                    ) : (
                                                        <span>&uarr;</span>
                                                    )
                                                ) : (
                                                    <span></span>
                                                )
                                            }
                                        </span>
                                    </th>
                                ))
                            }
                        </tr>
                    ))
                }
            </thead>
            <tbody {...getTableBodyProps()}>
                {
                    rows.map((row, i) => {
                        prepareRow( row );

                        return (
                            <tr {...row.getRowProps()}>
                                {
                                    row.cells.map(cell => (
                                        <td {...cell.getCellProps()}>{cell.render('Cell')}</td>
                                    ))
                                }
                            </tr>
                        );
                    })
                }
            </tbody>
        </table>
    )
};

export default TableWithSorting;