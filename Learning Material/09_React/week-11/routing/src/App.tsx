import Home from './Home';
import Contact from './Contact';
import SimpleForm from './SimpleForm';
import Navigation from './Navigation';
import { Route, Switch } from "react-router-dom";

function App(){
    return(
        <>
            <Navigation />
            <Switch>
                <Route path="/" component={Home} exact />
                <Route path="/contact" component={Contact} />
                <Route path="/form" component={SimpleForm} />
            </Switch>
        </>
    );
}

export default App;