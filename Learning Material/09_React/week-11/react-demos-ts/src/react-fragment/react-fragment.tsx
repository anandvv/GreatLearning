import React, { Fragment } from 'react';

const fruitsEl = (
    <Fragment>
        <li>Apples</li>
        <li>Oranges</li>
    </Fragment>
);

const veggiesEl = (
    <Fragment>
        <li>Potatoes</li>
        <li>Onions</li>
    </Fragment>
);

const shoppingListEl = (
    <ul>
        {fruitsEl}
        {veggiesEl}
    </ul>
);

export default shoppingListEl;