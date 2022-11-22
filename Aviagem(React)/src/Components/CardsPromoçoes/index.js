import "./index.css"


const CardsPromoçoes = ({img, titulo, preco}) => {
    return (
      
      <div className="card">
        <div className="imgBx">
            <img src={img} alt="images"/>
        </div>
        <div className="details">
            <h2>{titulo}<br/><span>{preco}</span></h2>
        </div>
      </div>
      
    )
}

export default CardsPromoçoes;
