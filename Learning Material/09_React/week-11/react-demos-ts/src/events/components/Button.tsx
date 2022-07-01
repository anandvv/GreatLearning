import React, { ReactNode, MouseEvent } from 'react';

type Props = {
    children: ReactNode // ReactElement does not accept string as child, so ReactNode is better for this
}

const Button = ( { children } : Props ) => {
    const clickHandler = ( event : MouseEvent<HTMLButtonElement> ) => {
        console.log( 'button click handler' );
        console.log( event.target );
    };
    
    return <button onClick={clickHandler}>{children}</button>;
}

export default Button;