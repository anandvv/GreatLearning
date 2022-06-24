import React from 'react';

const slidesData = [
    {
        id: 1,
        heading: "Styling in React",
        body: (
            <ul className="list-unstyled" style={ { marginTop: '1em' } }>
                <li>You can provide style using CSS classes</li>
                <li>You can provide inline styles using a JS object</li>
            </ul>
        )
    },
    {
        id: 2,
        heading: "Component Props",
        body: (
            <p>
                Props are used to pass data to a component instance, in order to customize the UI. The children are also treated as a prop.
            </p>
        )
    },
    {
        id: 3,
        heading: "Component State",
        body: (
            <p>
                State is used by a component to maintain data, related to the component itself, that changes with time.
            </p>
        )
    },
    {
        id: 4,
        heading: "Thank you",
        body: (
            <p>
                Questions??
            </p>
        )
    }
];

export default slidesData;