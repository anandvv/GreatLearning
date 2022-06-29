import React, {lazy, Suspense} from 'react';

import Home from './Home';
import Contact from './Contact';
import Navigation from './Navigation';
import { Route, Switch } from "react-router-dom";

const SimpleForm = lazy(() => import('./SimpleForm'));;

function App(){
    return(
        <>
            <Navigation />
            <Switch>
                <Route path="/" component={Home} exact />
                <Route path="/contact" component={Contact} />
                <Suspense fallback={<div>Loading...</div>}>
                <Route path="/form" component={SimpleForm} />
                </Suspense>
                
            </Switch>
        </>
    );
}

export default App;