import React from 'react';

import './slide.css';

import {
    bodyStyle,
    listUnstyled,
    headingFinalStyle
} from './slides.styles';


const el = (
    <div className="slide">
        <h1 style={headingFinalStyle}>Styling in React</h1>
        <hr />
        <ul style={ { ...bodyStyle, ...listUnstyled } }>
            <li>You can style using CSS classes</li>
            <li>You can style using inline styles</li>
        </ul>
    </div>
);

export default el;