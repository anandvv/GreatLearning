import { Component } from "react"
import List from "./List";

type newState = {
    status : boolean
}
class Constructor extends Component<newState>{

    // static defaultProps = {
    //     status : false
    // }

    constructor(props : newState){
        super(props)

        this.state = {
            status : false
        }
    }

    // change =() =>{
    //     this.setState(() =>{ return { 
    //         status : true
    //     } })
    // }

    
    generatedDate = (y : number, day : number, num : number) =>{
        var date = new Date(y, day, num)
        var d = date.getFullYear()+'/'+(date.getMonth()+1)+'/'+date.getDate()
    return d
    }

    newMoviesTable = {
        head : {
            Name: "Name",
            ReleaseDate : "ReleaseDate",
            Duration : "Duration"
        },
        a : {
            Name : "Pushpa",
            ReleaseDate : this.generatedDate(2021, 11, 17),
            Duration : "2 hr 59m"
        },
        b : {
            Name : "Atrangi Re",
            ReleaseDate : this.generatedDate(2021, 11, 24),
            Duration : "2 hr 30m"
        }
    }
    
    render() {
        // const {status} = this.state
        const {status} = this.props

        // let demo = null
        // if(status){
            let demo = (
                <table>
                    <thead>
                        <List 
                            name={this.newMoviesTable.head.Name} 
                            date={this.newMoviesTable.head.ReleaseDate} 
                            duration={this.newMoviesTable.head.Duration}
                        />
                    </thead>
                    <tbody>
                        <List 
                            name={this.newMoviesTable.a.Name} 
                            date={this.newMoviesTable.a.ReleaseDate} 
                            duration={this.newMoviesTable.a.Duration}
                        />
                        <List 
                            name={this.newMoviesTable.b.Name} 
                            date={this.newMoviesTable.b.ReleaseDate} 
                            duration={this.newMoviesTable.b.Duration}
                        />
                    </tbody>
                </table> 
            )
        // }
        return (
            <>
                {status && demo}
            </>
        )
    }
}
export default Constructor