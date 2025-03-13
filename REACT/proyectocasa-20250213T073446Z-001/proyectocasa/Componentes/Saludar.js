import React from 'react';
import { useState } from 'react';

export default function Saludar({funcion, campo }) {
    const saludar = () => {
        funcion(num);
      }
    const [num, setNum] = useState();

  const modificar = (campo) => {
    setNum(campo.target.value)
  }
  return (
    <div>
      <input onChange={modificar} value={num} type="text"/>
      <button onClick = {saludar}>Saludar</button>
    </div>
  )
}
