const BuscaPassagem = () => {
    return(
        <div>
 <section class="row g-0 mt-3">
        <div class="conteudo row g-0 d-flex justify-content-center">
          <div class="col-10 shadow-info m-4 bg-warning" style={{borderRadius:"50px"}}>
            <div class="row g-0 mx-5">
              <p class="col-12 h1 text-Dark p-4">Passagens aéreas</p>
            </div>
            <div class="row g-0 m-1">
              <div class="col-xxl-3 col-md-5 col-12">
                <form>
                  <div class="mb-3 d-flex justify-content-center align-items-center">
                    <a class="btn btn-primary" style={{backgroundColor: "#dd4b39", margin: "45px 10px 0px 0px"}} href="#!" role="button"><i class="bi bi-pin-map"></i></a>
                    <div>
                      <label for="exampleInputEmail1" class="form-label">De onde você está saindo?</label>
                      <input type="text" class="form-control" id="exampleInputEmail1" style={{marginTop:"10px"}} placeholder="Busque um aeroporto" aria-describedby="emailHelp"/>
                    </div>
                  </div>
                </form>
              </div>

              <div class="col-xxl-3 col-md-5 col-12">
                <form>
                  <div class="mb-3 d-flex justify-content-center align-items-center">
                    <a class="btn btn-primary mt-6" style={{backgroundColor: "#dd4b39", margin: "45px 10px 0px 0px"}} href="#!" role="button"><i class="bi bi-pin-map-fill"></i></a>
                    <div>
                      <label for="exampleInputEmail1" class="form-label ">Para onde você vai?</label>
                      <input type="text" class="form-control" id="exampleInputEmail1" style={{marginTop:"10px"}} placeholder="Busque uma cidade" aria-describedby="emailHelp"/>
                    </div>
                  </div>
                </form>
              </div>
              <div class="col-xxl-2 col-md-4 col-12">
                <form>
                  <div class="mb-3 d-flex justify-content-center align-items-center">
                    
                    <div>
                      <label for="exampleInputEmail1" class="form-label " style={{marginLeft: "60px"}} >Escolha o periodo</label>
                      <div class="d-flex justify-content-around align-items-center">
                        <a class="btn btn-primary mb-2 " style={{backgroundColor: "#dd4b39"}} role="button"><i class="bi bi-calendar-date"></i></a>
                        <input type="date" class="form-control " style={{margin:"10px"}} id="exampleInputEmail1" placeholder="Ida" aria-describedby="emailHelp"/>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div class="col-xxl-2 col-md-4 col-12">
                <form>
                  <div class="mb-3 d-flex justify-content-center align-items-center">
                    <div>
                      <label for="exampleInputEmail1" class="form-label" style={{marginLeft: "60px"}}>Volta</label>
                      <div class="d-flex justify-content-around align-items-center">
                        <input type="date" class="form-control " style={{margin:"10px"}} id="exampleInputEmail1" placeholder="volta" aria-describedby="emailHelp"/>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div class="col-xxl-1 col-md-1 col-12 d-flex justify-content-center align-items-center ">
                <button type="submit" class="btn btn-dark"style={{marginTop: "13px"}}>
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