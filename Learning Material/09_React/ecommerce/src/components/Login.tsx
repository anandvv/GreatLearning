import React, { Component, useState } from 'react';
import { useNavigate } from "react-router-dom";

export default function Login() {
    //React UseRowStateState
    const [errorMessages, setErrorMessages] = useState({name: "", message: ""});
    const [isSubmitted, setIsSubmitted] = useState(false);
    let navigate = useNavigate();

    const database = [
        {
            username: "uname1",
            password: "pass1"
        },
        { 
            username: "uname1",
            password: "pass2"
        }
    ];

    const errors = {
        username: 'Invalid Username',
        password: 'Invalid Password'
    }

    const handleSubmit = (event) => {
        event.preventDefault();

        let {username_received, password_received} = document.forms[0];

        const userData = database.find((user) => user.username === username_received.value);

        if(userData){
            if(userData.password !== password_received.value){
                //invalid password
                setErrorMessages({name: 'password', message: errors.password})
            } else {
                setIsSubmitted(true);
            }
        } else {
            setErrorMessages({name: 'username', message: errors.username})
        }
    };

    const renderErrorMessage = (username) => {
        return(
            username === errorMessages.name && (
                <div className="error">{errorMessages.message}</div>
            )
        );
    };

    const renderForm = (
        <div className="form">
            <form action="" onSubmit={handleSubmit}>
                <div className="input-container">
                    <>
                        <label htmlFor="username"></label>
                        <input type="text" name="username" required />
                        {renderErrorMessage("username")}
                    </>                    
                </div>

                <div className="input-container">
                    <>
                        <label htmlFor="password"></label>
                        <input type="password" name="password" required />
                        {renderErrorMessage("password")}
                    </>
                </div>

                <div className="button-container">
                    <input type="submit" />
                </div>
            </form>
        </div>
    );
    
    return (
        <div className="app">
            <div className="login-form">
                <>
                    <div className="title">
                        Login
                    </div>
                    {isSubmitted? navigate("/home") : renderForm}
                </>                
            </div>            
        </div>
    );

}