import BuscaPassagem from "../Components/BuscaPassagem"
import "../Components/Assets/css/style.css"

const Promocoes = () => {
    return (
        <div>
            <BuscaPassagem>
            </BuscaPassagem>
            <section>
              <div class="row justify-content-center">
                <div class="promo col-12">
                   <h1 class="tpromo">PROMOÇÕES</h1>
                    <p class="t2promo">Aqui você encontra a viagem perfeita com os melhores preços.</p>
                </div>
              </div>
            
            <div class="container-fluid justify-content-center align-itens-center ">
              <div class="row  justify-content-center">
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promorio">
                  <h4 class="card-title">Rio de Janeiro</h4>
                  <a href="#" class="btn btn-dark">R$ 300,00</a>
                  </div>
                </div>
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promominas">
                    <h4 class="card-title">Minas Gerais</h4>
                    <a href="#" class="btn btn-dark">R$ 250,00</a>
                  </div>
                </div>

                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promonatal">
                    <h4 class="card-title">Natal</h4>
                    <a href="#" class="btn btn-dark">R$ 500,00</a>
                  </div>
                </div>
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promogramado">
                    <h4 class="card-title">Gramado</h4>
                    <a href="#" class="btn btn-dark">R$ 350,00</a>
                  </div>
                </div>
              </div>

              <div class="row justify-content-center">
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promobahia">
                    <h4 class="card-title">Bahia</h4>
                    <a href="#" class="btn btn-dark">R$ 450,00</a>
                  </div>
                </div>
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promoporto">
                    <h4 class="card-title">Porto de Galinhas</h4>
                    <a href="#" class="btn btn-dark">R$ 500,00</a>
                  </div>
                </div>
  
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promoparis">
                    <h4 class="card-title">Paris</h4>
                    <a href="#" class="btn btn-dark">R$ 999,00</a>
                  </div>
                </div>
  
                <div class="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <div class="card-promodisney">
                    <h4 class="card-title">Disney</h4>
                    <a href="#" class="btn btn-dark">R$ 990,00</a>
                  </div>
                </div>
              </div>
            </div>
            </section>
        </div>
    )
}

export default Promocoes;