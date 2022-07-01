import React from 'react';
import SlideShow from './components/SlideShow';
import Slide from './components/Slide';

import './SlideShow-demo.css';

export default (
    <SlideShow defaultActiveSlide={0}>
        <Slide heading="Styling in React" showDivider={false} showTotal={false}>
            <ul className="list-unstyled" style={ { marginTop: '1em' } }>
                <li>You can provide style using CSS classes</li>
                <li>You can provide inline styles using a JS object</li>
            </ul>
        </Slide>
        <Slide heading="Component Props" showDivider={true} showTotal={true}>
            <p>
                Props are used to pass data to a component instance, in order to customize the UI. The children are also treated as a prop.
            </p>
        </Slide>
        <Slide heading="Component State" showDivider={true} showTotal>
            <p>
                State is used by a component to maintain data, related to the component itself, that changes with time.
            </p>
        </Slide>
        <Slide heading="Thank you">
            <p>
                Questions??
            </p>
        </Slide>
    </SlideShow>
);