// step 1 : pass props with data type any to the function
function PropsUsingFunction(props : any){

  return (
    <div>
      <h2>Employee Details...</h2>
      <p>
        {/* ste 2 : Use the value passed as shown below*/}
        <label>Name : <b>{props.Name}</b></label>
      </p>
    </div>
  )
}

export default PropsUsingFunction