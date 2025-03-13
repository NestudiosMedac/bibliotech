import './App.css';
import Reiniciar from './Componentes/Reiniciar';
import NumSecreto from './Componentes/NumSecreto';
import Formulario from './Componentes/Formulario';
import Puntuacion from './Componentes/Puntuacion';
import { useState } from 'react';



function App() {
  const  generarNumSecreto=()=>{
    return Math.trunc(Math.random()*20)+1;
  }

  const reiniciar = () =>{
    setNumSecreto(generarNumSecreto);
    setMensaje("Empiece a adivinar...")
    setPuntuacion(20);
  }

  const comparar = (numero) =>{
   if(!numero){
    setMensaje("Pon un número");
   }else if(Number(numero) == numSecreto){
      setMensaje("Ganaste");
      document.body.style.backgroundColor="green";
      if(score>puntuacion){
        setScore(puntuacion);
      }
    }else if(Number(numero)<numSecreto){
      setMensaje("Tu número es bajo");
      setPuntuacion(puntuacion-1);
    }
    else{
      setMensaje("Tu numero es alto");
      setPuntuacion(puntuacion-1);
    }
    if(puntuacion == 0){
      setMensaje("Perdiste");
      document.body.style.backgroundColor="red";  
    }
   }


  // const comparar=(numero)=>{
    
  //   if(!numero) {
  //     setMensaje("No es un numero")
  //   }
  //   else if (Number(numero) !== numSecreto) {
  //     if(puntuacion>1){
  //       setPuntuacion(puntuacion -1);
  //       Number(numero)>numSecreto?setMensaje("Tu número es muy alto"):setMensaje("Tu número es muy bajo")
        
  //     }
  //     else{
  //       setMensaje("Perdiste el juego");
  //       setPuntuacion(0);
  //     }
  //   } else {
  //     setMensaje("Ganaste");
  //     document.body.style.backgroundColor="green";
  //     if (puntuacion>score){
  //       setScore(puntuacion);
  //     }
  //   }

    
  // }
  

  const [numSecreto, setNumSecreto] = useState(generarNumSecreto);
  const [mensaje, setMensaje] = useState("Empiece a adivinar...");
  const [puntuacion, setPuntuacion] = useState(20);
  const [score, setScore] = useState(0);





  return (
    <div className="container">
    <Reiniciar reiniciar={reiniciar}/>
    {/* Sustituye el boton que se encuentra en reiniciar */}
    <h1>¡Adivina mi número!{numSecreto}</h1>
    <NumSecreto/>
    <br/>
    <Formulario comprobar={comparar}/>
    </div>
  );
}

export default App;
