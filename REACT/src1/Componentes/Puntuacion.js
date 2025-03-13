import React from 'react'
import Mensaje from './Mensaje'
import LineaPuntuacion from './LineaPuntuacion'

export default function Puntuacion(mensaje, puntuacion, score) {
  return (
    <div>
          <div className="score-section">
      <br/>
        <Mensaje men={mensaje}/>
      <br/>
     <LineaPuntuacion etiqueta="Puntuacion: " id="score" numero={puntuacion}/>
     <LineaPuntuacion etiqueta="Puntuaje Alto" id="highscore" numero={score}/>
     {/* asi se pasan parametros */}
    </div>
  </div>
  )
}
