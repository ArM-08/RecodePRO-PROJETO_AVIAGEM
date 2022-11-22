import React from 'react';
import AliceCarousel from 'react-alice-carousel';
import 'react-alice-carousel/lib/alice-carousel.css';
import Rio from "../Components/Assets/Imagens/rio de janeiro(carousel).jpg"
import Floripa from "../Components/Assets/Imagens/florianopolis(carousel).jpg"
import PortoDeGalinhas from "../Components/Assets/Imagens/porto de galinhas(carousel).jpg"
import Recife from "../Components/Assets/Imagens/recife(carousel).jpg"
import Disney from "../Components/Assets/Imagens/disney(carousel).jpg"
import Paris from "../Components/Assets/Imagens/paris(carousel).jpg"

const responsive = {
    0: { items: 1 },
    568: { items: 3 },
    1024: { items: 5 },
};

const items = [
    <div className="item" data-value="1"style = {{padding:"2px"}}><img src = {Rio} className="img-fluid"/><div className="card-img-overlay text-center text-light" style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}} > <h2>Rio de Janeiro</h2></div></div>,
    <div className="item" data-value="2"style = {{padding:"2px"}}><img src = {Floripa}className="img-fluid"/> <div className="card-img-overlay text-center text-light"style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}}><h2>Florianópolis</h2></div></div>,
    <div className="item" data-value="3" style = {{padding:"2px"}}><img src = {PortoDeGalinhas}className="img-fluid"/><div className="card-img-overlay text-center text-light"style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}}><h2>Porto de galinhas</h2></div>
    </div>,
    <div className="item" data-value="4"style = {{padding:"2px"}}><img src = {Recife}className="img-fluid"/><div className="card-img-overlay text-center text-light"style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}}><h2>Recife</h2></div></div>,
    <div className="item" data-value="5"style = {{padding:"2px"}}><img src = {Disney}className="img-fluid"/><div className="card-img-overlay text-center text-light"style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}}><h2>Disney</h2></div></div>,
    <div className="item" data-value="6"style = {{padding:"2px"}}><img src = {Paris}className="img-fluid"/><div className="card-img-overlay text-center text-light"style={{WebkitTextStrokeWidth: "1px", WebkitTextStrokeColor: "black"}}><h2>Paris</h2></div></div>,
];

const CarouselTop = () => (
    <AliceCarousel
        mouseTracking
        items={items}
        responsive={responsive}
        controlsStrategy="alternate"
        infinite= "true"
        autoPlay= "true"
        autoPlayInterval= "2000"
        disableButtonsControls="true"
    />
);
export default CarouselTop;