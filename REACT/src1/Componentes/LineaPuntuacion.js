import React from 'react'

export default function LineaPuntuacion(props) {
    // tambien puedes poner los paramentros (etiqueta, id, numero)
  return (
    <div>
       <p>{props.etiqueta} <span id={props.id}>{props.numero}</span></p>
    </div>
  )
}
