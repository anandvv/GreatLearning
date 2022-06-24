import React, { useRef } from 'react';

type Props = { };

const RefComponent = ( props : Props ) => {
    const inputRef = useRef<HTMLInputElement>( null );
    
    const changeHandler = ( event : React.ChangeEvent<HTMLInputElement> ) => {
        console.log( inputRef.current?.value );
    }

    const submitHandler = ( event : React.FormEvent<HTMLFormElement> ) => {
        event.preventDefault();
        inputRef.current?.focus();
    }

    return (
        <form onSubmit={submitHandler}>
            <input
                type="text"
                ref={inputRef}
                onChange={changeHandler}
            />
            <button>Submit</button>
        </form>
    );
};

export default RefComponent;