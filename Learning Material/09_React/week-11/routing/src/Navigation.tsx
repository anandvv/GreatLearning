import { NavLink } from "react-router-dom"
import './Navigation.css'
function Navigation() {

    return(
        <>
            {/* NavLink will highlight the the link */}
            <NavLink to="/" className="linkActive" exact>Home</NavLink> <br />
            <NavLink to="/contact" className="linkActive">contact</NavLink> <br />
            <NavLink to="/form" className="linkActive">Form</NavLink>
        </>
    )
}
export default Navigation