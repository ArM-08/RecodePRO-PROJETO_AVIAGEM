import BuscaPassagem from "../Components/BuscaPassagem"
import RiodeJaneiro from "../Components/Assets/Imagens/rio de janeiro.jpg"
import SaoPaulo from "../Components/Assets/Imagens/saopaulo.jpg"
import EspiritoSanto from "../Components/Assets/Imagens/espiritosanto.jpg"
import Florianopolis from "../Components/Assets/Imagens/florianopolis.jpg"
import Recife from "../Components/Assets/Imagens/recife.jpg"
import Manaus from "../Components/Assets/Imagens/manaus.jpg"
import Brasilia from "../Components/Assets/Imagens/brasilia.jpg"
import Curitiba from "../Components/Assets/Imagens/curitiba.jpg"
import EstadosUnidos from "../Components/Assets/Imagens/estadosunidos.jpg"
import França from "../Components/Assets/Imagens/frança.jpg"
import Italia from "../Components/Assets/Imagens/italia.jpg"
import Argentina from "../Components/Assets/Imagens/argentina.jpg"

const Destinos = () => {
    return(
        <div>
            <BuscaPassagem>
            </BuscaPassagem>
            <section> 
            <div class="container-promo">
      <div class="row">
        <div class="promo col-12">
          <h1 class="tpromo">Destinos</h1>
          <p class="t2promo">Em meio a tantos lugares maravilhosos para viajar, fica até difícil escolher os melhores, por isso aqui você terá acesso a todos os destinos disponiveis seja internacional ou nacional.</p>
        </div>
      </div>
      
            </div>
          </section>
          <section>
            <div class="container">
              <h2 style={{fontFamily: "tommy;"}}>Nacionais</h2>
        <div class="row">
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3 ">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={RiodeJaneiro} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Rio de Janeiro</h5>
                <p class="card-text">O Rio de Janeiro, é a cidade brasileira mais conhecida no exterior tem a fama de possuir um povo alegre, ávido por sol, praia, futebol e samba..</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={SaoPaulo} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">São Paulo</h5>
                <p class="card-text">Esta metrópole é efervescente, viva e dada a muitas metamorfoses. Sempre haverá uma novidade a ser descoberta.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={EspiritoSanto} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Espirito Santo</h5>
                <p class="card-text">O Espírito Santo, estado da região Sudeste do Brasil, é conhecido por suas praias tropicais e áreas naturais montanhosas preservadas.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Florianopolis} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Florianopolis</h5>
                <p class="card-text">A combinação do número cabalístico “42 praias” com a expressão mágica “qualidade de vida” faz de Floripa um destino desejado tanto para passar férias quanto para viver.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Recife} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Recife</h5>
                <p class="card-text">Uma das capitais mais vibrantes do Nordeste, Recife aposta em atrações culturais e gastronômicas.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Manaus} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Manaus</h5>
                <p class="card-text">Conhecer Manaus é se deslumbrar com as surpresas de uma região ímpar, onde a natureza impõe soberania incontestável.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Brasilia} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Brasilia</h5>
                <p class="card-text"> Única cidade moderna do mundo a receber o título de Patrimônio Cultural da Humanidade, Brasília é peculiar sob todos os aspectos.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Curitiba} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Curitiba</h5>
                <p class="card-text">A cidade de Curitiba, capital do estado do Paraná, é conhecida pelo cuidado com o planejamento urbano, belas áreas verdes e um transporte público de qualidade.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <h2 style={{fontFamily: "tommy;"}}>Internacionais</h2>
        </div>
        <div class="row">
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={EstadosUnidos} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Estados Unidos</h5>
                <p class="card-text">Nova York, um centro financeiro e cultural global, e a capital, Washington, DC.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={França} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">França</h5>
                <p class="card-text">A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas. </p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Italia} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Italia</h5>
                <p class="card-text">A Itália, país europeu com uma longa costa mediterrânea, deixou uma marca poderosa na culinária e na cultura ocidentais.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
          <div class="col-12 col-sm-12 col-md-6 col-lg-4 col-xxl-3">
            <div class="card mb-4" style={{width: "18rem"}}>
              <img src={Argentina} class="card-img-top" alt="..."/>
              <div class="card-body">
                <h5 class="card-title2">Argentina</h5>
                <p class="card-text">A Argentina é um país da América do Sul com uma área extensa que abrange montanhas dos Andes, lagos glaciais e pradarias nos Pampas, ocupadas tradicionalmente por seu famoso gado.</p>
                <a href="#" class="btn btn-dark">Comprar</a>
              </div>
            </div>
          </div>
        </div>
            </div>  
          </section>
        </div>
    )
}
export default Destinos;