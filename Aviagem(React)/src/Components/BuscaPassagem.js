
const BuscaPassagem = (saida, destino, diaida, diavolta) => {
    return(
        <div>
 <section className="row g-0 mt-3">
        <div className="conteudo row g-0 d-flex justify-content-center">
          <div className="col-10 shadow-info m-4 bg-warning" style={{borderRadius:"50px"}}>
            <div className="row g-0 mx-5">
              <p className="col-12 h1 text-Dark p-4">Passagens aéreas</p>
            </div>
            <div className="row g-0 m-1">
              <div className="col-xxl-3 col-md-5 col-12">
                <form>
                  <div className="mb-3 d-flex justify-content-center align-items-center">
                    <a className="btn btn-primary" style={{backgroundColor: "#dd4b39", margin: "45px 10px 0px 0px"}} href="#!" role="button"><i className="bi bi-pin-map"></i></a>
                    <div>
                      <label htmlFor="exampleInputEmail1" className="form-label">De onde você está saindo?</label>
                      <input type="text" className="form-control" id={saida} style={{marginTop:"10px"}} placeholder="Busque um aeroporto" aria-describedby="emailHelp" />
                    </div>
                  </div>
                </form>
              </div>

              <div className="col-xxl-3 col-md-5 col-12">
                <form>
                  <div className="mb-3 d-flex justify-content-center align-items-center">
                    <a className="btn btn-primary mt-6" style={{backgroundColor: "#dd4b39", margin: "45px 10px 0px 0px"}} href="#!" role="button"><i className="bi bi-pin-map-fill"></i></a>
                    <div>
                      <label htmlFor="exampleInputEmail1" className="form-label ">Para onde você vai?</label>
                      <input type="text" className="form-control" id={destino} style={{marginTop:"10px"}} placeholder="Busque uma cidade" aria-describedby="emailHelp"/>
                    </div>
                  </div>
                </form>
              </div>
              <div className="col-xxl-2 col-md-4 col-12">
                <form>
                  <div className="mb-3 d-flex justify-content-center align-items-center">
                    
                    <div>
                      <label htmlFor="exampleInputEmail1" className="form-label " style={{marginLeft: "60px"}} >Escolha o periodo</label>
                      <div className="d-flex justify-content-around align-items-center">
                        <a className="btn btn-primary mb-2 " style={{backgroundColor: "#dd4b39"}} role="button"><i className="bi bi-calendar-date"></i></a>
                        <input type="date" className="form-control " style={{margin:"10px"}} id={diaida} placeholder="Ida" aria-describedby="emailHelp"/>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div className="col-xxl-2 col-md-4 col-12">
                <form>
                  <div className="mb-3 d-flex justify-content-center align-items-center">
                    <div>
                      <label htmlFor="exampleInputEmail1" className="form-label" style={{marginLeft: "60px"}}>Volta</label>
                      <div className="d-flex justify-content-around align-items-center">
                        <input type="date" className="form-control " style={{margin:"10px"}} id={diavolta} placeholder="volta" aria-describedby="emailHelp"/>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div className="col-xxl-1 col-md-1 col-12 d-flex justify-content-center align-items-center ">
                <button type="submit" className="btn btn-dark"style={{marginTop: "13px"}}>
                  Buscar
                </button>
              </div>
            </div>
          </div>
        </div>
      
      </section>


        </div>

    )
}

export default BuscaPassagem;