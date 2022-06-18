import React from 'react';
import './slide.css';

import { 
    bodyStyle,
    pStyle,
    headingFinalStyle
} from './slides.styles'; 

const el = (
    <div className="slide">
        <h1 style={headingFinalStyle}>Styling in React</h1>
        <h1 style={{color: "red"}}>Inline Style!</h1>
        <hr />
        <p style={pStyle}>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus sed sapiente voluptatem facere magni debitis aperiam molestiae laudantium consequuntur libero. Aut at deserunt pariatur quod itaque tenetur omnis possimus veniam?
        </p>
        <p style={bodyStyle}>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Natus sed sapiente voluptatem facere magni debitis aperiam molestiae laudantium consequuntur libero. Aut at deserunt pariatur quod itaque tenetur omnis possimus veniam?
        </p>

    </div>
);

export default el;