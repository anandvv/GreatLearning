import React, { MouseEvent } from 'react';
import Button from './components/Button';
import LoginForm from './components/LoginForm';
import ListView, { Item } from './components/ListView';

const items : Item[] = [
    {
        id: 1,
        name: 'iPhone 12'
    },
    {
        id: 2,
        name: 'iPad Pro'
    },
    {
        id: 3,
        name: 'MacBook Air'
    }
];

const spacer = {
    margin: '4em'
};

const clickHandler = ( event : MouseEvent<HTMLButtonElement> ) => {
    console.log( 'button click handler' );
    console.log( event.target );
};

export default (
    <>
        <div style={spacer}>
            <h2>button</h2>
            <button onClick={clickHandler}>Click me</button>
        </div>
        <div style={spacer}>
            <h2>Button (function component)</h2>
            <Button>Click me as well</Button>
        </div>
        <div style={spacer}>
            <h2>LoginForm (class component)</h2>
            <LoginForm />
        </div>
        <div style={spacer}>
            <h2>ListView (passsing arguments to event handler)</h2>
            <ListView items={items} />
        </div>
    </>
);