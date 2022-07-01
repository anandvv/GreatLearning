import React, { Component } from 'react';

type Props = { };
type State = {
    email: string,
    password: string
};

class LoginForm extends Component<Props, State> {
    state = {
        email: 'john@example.com',
        password: ''
    }

    updateValue = ( event : React.ChangeEvent<HTMLInputElement> ) => {
        const name = event.target.name;
        const value = event.target.value;

        this.setState({
            [name]: value
        } as Pick<State, keyof State>);
    }

    submitHandler = ( event : React.FormEvent<HTMLFormElement> ) => {
        event.preventDefault();
        console.log( this.state );
    };

    render() {
        const { email, password } = this.state;

        return (
            <form onSubmit={this.submitHandler}>
                <div>
                    <label htmlFor="email">Email</label>
                    <input
                        type="email"
                        id="email"
                        name="email"
                        value={email}
                        onChange={this.updateValue}
                    />
                    {email}
                </div>
                <div>
                    <label htmlFor="password">Password</label>
                    <input
                        type="password"
                        id="password"
                        name="password"
                        value={password}
                        onChange={this.updateValue}
                    />
                    {password}
                </div>
                <button type="submit">Login</button>
            </form>
        );
    }
}

export default LoginForm;