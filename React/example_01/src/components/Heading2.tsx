import { ReactElement } from "react"


type HeadingProps= {title : string}

const Heading2 = ({title}:HeadingProps):ReactElement => {
  return (
    <div>
      <h2>{title}</h2>
    </div>
  )
}

export default Heading2