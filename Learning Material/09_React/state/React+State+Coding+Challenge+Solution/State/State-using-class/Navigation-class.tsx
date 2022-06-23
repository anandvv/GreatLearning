import { Component } from "react";

import './Navigation.css'

class Navigation extends Component{
    render() {
        const btn = (
            // can pass the link using props below
            <a href="#" className="background">Sample</a>
        );
    return btn;
    }
}

export default Navigation;