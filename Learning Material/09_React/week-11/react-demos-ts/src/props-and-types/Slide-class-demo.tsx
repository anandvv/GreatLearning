import React from 'react';
import Slide from './components/Slide-class';

import './Slide-demo.css';

const el = (
    <>
        <Slide heading="How do you styles in React?" page={{ current: 1, total : 2 }}>
            <ul className="list-unstyled" style={ { marginTop: '1.5em' } }>
                <li>You can provide style using CSS classes</li>
                <li>You can provide inline styles using a JS object</li>
            </ul>
        </Slide>
        <Slide heading="What are props" page={{ current: 2, total : 2 }}>
            <p>
                Props are values used to customize the React component instance. children are a special prop.
            </p>
        </Slide>
    </>
);

export default el;