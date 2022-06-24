import React from 'react';
import SlideShow from './components/SlideShow-class';
import Slide from './components/Slide-class';

import './SlideShow-demo.css';

export default (
    <SlideShow>
        <Slide heading="Styling in React">
            <ul style={ { marginTop: '1em' } }>
                <li>You can provide style using CSS classes</li>
                <li>You can provide inline styles using a JS object</li>
            </ul>
        </Slide>
        <Slide heading="Component Props">
            <p>
                Props are used to pass data to a component instance, in order to customize the UI. The children are also treated as a prop.
            </p>
        </Slide>
    </SlideShow>
);