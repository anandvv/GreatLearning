import './Block.css'
import PropTypes from 'prop-types'

const Block = ({name, email}) =>{
    return (
    <div>
        <h1>Name: {name}</h1>
        <h1 id="email">Email: {email}</h1>
    </div>
    )
}
Block.propTpyes = {
    name : PropTypes.string.isRequired,
    email : PropTypes.string.isRequired
}
export default Block;