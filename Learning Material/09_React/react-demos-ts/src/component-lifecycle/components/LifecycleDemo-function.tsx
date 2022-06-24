import React, { useState, useEffect } from 'react';
import Item from '../models/Item';
import { fetchProductsOfPage } from '../services/products';

type Props = { };
type State = {
    page: number,
    status: 'LOADING' | 'LOADED' | 'ERROR_LOADING',
    products: Item[],
    error: Error | null
}

const LifecycleDemo = ( ) => {
    console.log( 'render' );

    const [ page, setPage ] = useState<number>( 1 );
    const [ status, setStatus ] = useState<'LOADING' | 'LOADED' | 'ERROR_LOADING'>( 'LOADING' );
    const [ products, setProducts ] = useState<Item[]>( [] );
    const [ error, setError ] = useState<Error | null>( null );

    const nextPage = () => {
        setPage( page => page + 1 );
    };

    useEffect(() => {
        const fetchProductsOfPageHelper = async () => {
            setStatus( 'LOADING' );
    
            try {
                const products = await fetchProductsOfPage( page );

                setProducts( products );
                setStatus( 'LOADED' );
            } catch( error ) {
                setError( error );
                setStatus( 'ERROR_LOADING' );
            }
        }

        fetchProductsOfPageHelper();

        return () => {
            console.log( 'cleanup function' );
        };
    }, [ page ] );

    // componentWillUnmount() {
    //     console.log( 'componentWillUnmount' );
    // }

    return (
        <>
            {status === 'LOADING' && <div>Loading products...</div>}
            {status === 'ERROR_LOADING' && <div>{error?.message}</div>}
            {
                status === 'LOADED' && (
                    <>
                        <button onClick={nextPage}>Next page</button>
                        <span>You are on page {page}</span>
                        <ul>
                        {
                            products.map(
                                ( { id, name } ) => <li key={id}>{name}</li>
                            )
                        }
                        </ul>
                    </>
                )
            }
        </>
    );
}

export default LifecycleDemo;