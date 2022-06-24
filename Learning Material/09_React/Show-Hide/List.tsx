const List = (props : any) =>{
    
    return (
        <tr>
            <td>{props.name}</td>
            <td>{props.date}</td>
            <td>{props.duration}</td>
        </tr>
    )
}

export default List;