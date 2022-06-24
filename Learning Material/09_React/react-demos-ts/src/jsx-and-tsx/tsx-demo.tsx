import React, { ReactElement } from 'react';

import './welcome.css';

let el : ReactElement;

el = (
    <div title="Welcome">
        <h1>Welcome to the world of React</h1>
        <p>
            <span id="framework-name" className="text-bold">React</span> is a UI library created by Facebook
        </p>
    </div>
);

export default el;