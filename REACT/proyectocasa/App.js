
import './App.css';
import Titulo from './Componentes/Titulo';
import Campo from './Componentes/Campo';
import Saludar from './Componentes/Saludar';
import Texto from './Componentes/Texto';

import React,{useRef,useState} from 'react';

function App() {
  const[nombre, setNombre] = useState();
  const[numEdad, setNumEdad] = useState();
  const[tipoEdad, setTipoEdad] = useState();
  const[mensajePrimero, setMensajePrimero] = useState("Nombre:");
  const[mensajeSegundo, setMensajeSegundo] = useState("Edad:");
  
  const campo1 = useRef();
 
  const saludar = (numEdad) => {
    alert(campo1.current.value);
    setNombre(campo1.current.value.toString());
   
    if(!numEdad) {
      setTipoEdad("Pon un número porfavor");

    }else if ((Number(numEdad)>40)) {
      setTipoEdad("un yayo");

    }else if (Number(numEdad)<=40 && Number(numEdad)>21 ) {
      setTipoEdad(" tas mayor");

    }else if (Number(numEdad) < 21 ) {
        setTipoEdad("tas chiquito");
    }

  }

  return (
    <div className = "container">
      <Titulo value = {nombre} mensaje = {mensajePrimero}/>
      <input ref={campo1} type="text"/>
      <Titulo value = {numEdad} mensaje= {mensajeSegundo}/>
      <Saludar funcion = {saludar} campo = {numEdad} />
      <Texto param = {nombre} param2 = {tipoEdad}/>
    
  </div>
  );
}

export default App;
