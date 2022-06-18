const pStyle = {
    fontSize: '1.5em',
    fontStyle: 'italic'
}

const headingStyle = {
    fontSize: '4em',
    fontFamily: 'Helvetica'
}

const bodyStyle = {
    fontSize: '2em'
}

const textCenter = {
    textAlign: 'center' as const
}

const headingFinalStyle = {
    ...headingStyle,
    ...textCenter
}

export {
    headingStyle,
    bodyStyle,
    pStyle,
    textCenter,
    headingFinalStyle
};