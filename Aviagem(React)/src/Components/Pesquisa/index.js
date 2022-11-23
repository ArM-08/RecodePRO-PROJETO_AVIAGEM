import { useState } from "react";
import { Destinos } from "./dadosPesquisa";
import "./index.css"



const Pesquisa=()=> {
    const [destinosPesquisados, setDestinosPesquisados] = useState([])
    const fazPesquisa =(evento) => {
        const destinoDigitado =evento.target.value
        const resultadoPesquisa = Destinos.filter(destino=>destino.nome.includes(destinoDigitado))
        setDestinosPesquisados(resultadoPesquisa)}
        


    return (
        <div>
        <input type="text"  placeholder="Pesquisa"  onChange={evento => fazPesquisa(evento)}
        />

    {destinosPesquisados.map(destino=> ( 
                <div className="Busca">
                <img src= {destino.src}/>
                <p>{destino.nome}</p>
                <p>{destino.valor}</p>

                </div>
        ))}
        </div>
    )
}

export default Pesquisa;
