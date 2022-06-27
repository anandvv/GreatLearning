import React from 'react';
import { 
    RouteComponentProps,
    Route,
    Switch,
    NavLink } from 'react-router-dom';
import Email from "./Email";

type Props = {};

class Contact extends React.Component<Props & RouteComponentProps> {
    render(): React.ReactNode{
        return(
            <>
                <h1>Welcome to my World</h1>
                <NavLink to={`${this.props.match.url}/phone`}>Phone</NavLink>
                <NavLink to={`${this.props.match.url}/address`}>Address</NavLink>
                <NavLink to={`${this.props.match.url}/email`}>Email</NavLink>

                <Switch>
                    {/* this also works */}
                    {/* <Route path={`${match.url}/phone`}></Route>     */}
                    {/* difference will be seen in dynamic path parameters. Will see in case study */}

                    <Route path={`${this.props.match.path}/phone`}>
                        <>
                            <div className="contactDetails">2345678765432</div>
                        </>
                    </Route>
                    
                    <Route path={`${this.props.match.path}/address`} render={() => <div className="contactDetails">123 Main Street, Milton, VA 40402</div>} />
                    
                    {/* if props need to be passed to email */}
                    {/* <Route path={`${match.path}`/address} render={()=><Email value={"di@gmail.com"}/>}/> */}

                    incase if email aslo needed history, location and match.. then we can pass it in props
                    <Route path={`${this.props.match.path}/email`} render={(props : RouteComponentProps)=> <Email 
                    value={"id@gmail.com"} {...props}/>}/> 
                
                </Switch>
            </>
        );
    }
}

export default Contact;