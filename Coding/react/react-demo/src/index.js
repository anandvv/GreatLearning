import React from 'react';
import ReactDom from 'react-dom';

const el = (
    <div title="Welcome to React">
        <h1>An introduction to React!</h1>
        <p id="introduction">
            <span className="text-bold">React</span>
            &nbsp;is a JS library for building the UI
        </p>
    </div>
);

ReactDom.render(el, document.getElementById('root'));