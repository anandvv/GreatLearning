import React, { Component } from 'react';
import Item from '../models/Item';
import { fetchProductsOfPage } from '../services/products';

type Props = { };
type State = {
    page: number,
    status: 'LOADING' | 'LOADED' | 'ERROR_LOADING',
    products: Item[],
    error: Error | null
}

class LifecycleDemo extends Component<Props, State> {
    constructor( props : Props ) {
        super( props );

        console.log( 'constructor' );

        this.state = {
            page: 1,
            status: 'LOADING',
            products: [],
            error: null
        };
    }

    nextPage = () => {
        this.setState(
            state => {
                return {
                    page: state.page + 1
                };
            }
        );
    }

    render() {
        console.log( 'render' );

        const { page, status, products, error } = this.state;

        return (
            <>
                {status === 'LOADING' && <div>Loading products...</div>}
                {status === 'ERROR_LOADING' && <div>{error?.message}</div>}
                {
                    status === 'LOADED' && (
                        <>
                            <button onClick={this.nextPage}>Next page</button>
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
        )
    }

    async fetchProductsOfPage() {
        this.setState({
            status: 'LOADING'
        });

        try {
            const products = await fetchProductsOfPage( this.state.page );
            this.setState({
                status: 'LOADED',
                products
            });
        } catch( error ) {
            this.setState({
                status: 'ERROR_LOADING',
                error
            });
        }
    }

    componentDidMount() {
        console.log( 'componentDidMount' );
        this.fetchProductsOfPage();
    }

    componentDidUpdate( oldProps : Props, oldState : State ) {
        console.log( 'componentDidUpdate' );

        if( oldState.page !== this.state.page ) {
            this.fetchProductsOfPage();
        }
    }

    componentWillUnmount() {
        console.log( 'componentWillUnmount' );
    }
}

export default LifecycleDemo;