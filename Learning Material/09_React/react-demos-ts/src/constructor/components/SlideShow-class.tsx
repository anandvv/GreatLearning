import React, { cloneElement, Component, ReactElement } from 'react';

type Props = {
    initialActiveSlide: number,
    children: ReactElement[]
};

type State = {
    activeSlide: number
}

class SlideShow extends Component<Props, State> {
    // state = {
    //     activeSlide: 0
    // };

    constructor( props : Props ) {
        super( props ); // this.props = props;

        this.state = {
            activeSlide: this.props.initialActiveSlide
        };
    }

    previous = () => {
        this.setState(state => {
            return {
                activeSlide: Math.max( state.activeSlide - 1, 0 )
            };
        });
    }
    
    next = () => {
        this.setState(state => {
            return {
                activeSlide: Math.min( state.activeSlide + 1, this.props.children.length - 1 )
            };
        });
    }

    render() {
        const { activeSlide } = this.state;
        const { children } = this.props;

        return (
            <>
                <div style={ { float: 'right' } }>
                    <button onClick={this.previous}>Previous</button>
                    <button onClick={this.next}>Next</button>
                </div>
                {
                    cloneElement(
                        children[activeSlide],
                        {
                            page: {
                                current: activeSlide + 1,
                                total: children.length
                            }
                        }
                    )
                }
            </>
        );
    }
}

export default SlideShow;