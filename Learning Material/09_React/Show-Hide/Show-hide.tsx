import { useState } from "react";
import List from "./List";
import "./Show-hide.css"

const ShowHide = () =>{

    const generatedDate = (y : number, day : number, num : number) =>{
        var date = new Date(y, day, num)
        var d = date.getFullYear()+'/'+(date.getMonth()+1)+'/'+date.getDate()
    return d
    }

    const newMoviesTable = {
        head : {
            Name: "Name",
            ReleaseDate : "ReleaseDate",
            Duration : "Duration"
        },
        a : {
            Name : "Pushpa",
            ReleaseDate : generatedDate(2021, 11, 17),
            Duration : "2 hr 59m"
        },
        b : {
            Name : "Atrangi Re",
            ReleaseDate : generatedDate(2021, 11, 24),
            Duration : "2 hr 30m"
        }
    }

    const [after, setAfter] = useState(false)

    return (
        <div>
            <h2>New Movies List</h2>
            <button onClick={() =>{setAfter(true)}}>Show</button>
            <button onClick={() =>{setAfter(false)}}>Hide</button>


            {
                after ? 
                    <table>
                        <thead>
                            <List 
                                name={newMoviesTable.head.Name} 
                                date={newMoviesTable.head.ReleaseDate} 
                                duration={newMoviesTable.head.Duration}
                            />
                        </thead>
                        <tbody>
                            <List 
                                name={newMoviesTable.a.Name} 
                                date={newMoviesTable.a.ReleaseDate} 
                                duration={newMoviesTable.a.Duration}
                            />
                            <List 
                                name={newMoviesTable.b.Name} 
                                date={newMoviesTable.b.ReleaseDate} 
                                duration={newMoviesTable.b.Duration}
                            />
                        </tbody>
                    </table> 
                : null
            }
            {after}     
        </div>
    )
}

export default ShowHide;