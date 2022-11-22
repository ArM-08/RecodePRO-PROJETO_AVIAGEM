





const CardDestinos = ({img, titulo, descricao}) => {
    return (
        <div className="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div className="cardD mb-4" style={{width: "18rem"}}>
              <img src={img} className="card-img-top" alt="..."/>
                <div className="cardD-body">
                <h5 className="cardD-title2">{titulo}</h5>
                <p className="cardD-text">{descricao}</p>
                <a href="#" className="btn btn-dark">Comprar</a>
                </div>
            </div>
        </div>
    )
}
export default CardDestinos;