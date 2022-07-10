import React, { Component } from 'react';
import '../index.css';

export default function Header(props){
    return(
        <header className="">
            <div>
                <a href="#/">
                    <h1>Shopping Cart</h1>
                </a>
            </div>

            <div>
                <a href="#/cart">Cart</a>
                <a href="#/signin">Welcome</a>
            </div>
        </header>
    );
}