import BuscaPassagem from "../Components/BuscaPassagem"
import "../Components/Assets/css/style.css"
import CardsPromoçoes from "../Components/CardsPromoçoes"
import RiodeJaneiro from "../Components/Assets/Imagens/rio de janeiro.jpg"
import Minas from "../Components/Assets/Imagens/minas.jpg"
import Natal from "../Components/Assets/Imagens/natal.jpg"
import Gramado from "../Components/Assets/Imagens/gramado.jpg"
import Bahia from "../Components/Assets/Imagens/bahia.jpg"
import PortodeGalinhas from "../Components/Assets/Imagens/porto de galinhas.jpg"
import Paris from "../Components/Assets/Imagens/paris.jpg"
import Disney from "../Components/Assets/Imagens/disney.jpg"
import NavBar from './../Components/NavBar'
import Footer from "../Components/Footer"


const Promocoes = () => {
    return (
        <div>
              <NavBar/>
            <BuscaPassagem>
            </BuscaPassagem>
            <section>
              <div className="row justify-content-center">
                <div className="promo col-12">
                   <h1 className="tpromo">PROMOÇÕES</h1>
                    <p className="t2promo">Aqui você encontra a viagem perfeita com os melhores preços.</p>
                </div>
              </div>
            
            <div className="container-fluid justify-content-center align-itens-center ">
              <div className="row  justify-content-center">
                
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                  <CardsPromoçoes
         img={RiodeJaneiro}
         titulo='Rio de Janeiro'
         preco = 'De R$ 400 por R$ 300'
         />
                </div>
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={Minas}
         titulo='Minas Gerais'
         preco = 'De R$ 300 por R$ 200'
         />
                </div>

                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                
                  <CardsPromoçoes
         img={Natal}
         titulo='Natal'
         preco = 'De R$ 700 por R$ 500'
         />
                    
                </div>
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={Gramado}
         titulo='Gramado'
         preco = 'De R$ 500 por R$ 350'
         />
                  
                </div>
              </div>

              <div className="row justify-content-center">
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={Bahia}
         titulo='Bahia'
         preco = 'De R$ 600 por R$ 450'
         />
                </div>
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={PortodeGalinhas}
         titulo='Porto de Galinhas'
         preco = 'De R$ 800 por R$ 550'
         />   
                </div>
  
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={Paris}
         titulo='Paris'
         preco = 'De R$ 1200 por R$ 990'
         />              
                </div>
  
                <div className="promocoes col-12 col-sm-12 col-md-6 col-lg-6 col-xxl-3">
                <CardsPromoçoes
         img={Disney}
         titulo='Disney'
         preco = 'De R$ 1200 por R$ 990'
         /> 
                </div>
              </div>
            </div>
            </section>
            <Footer/>
        </div>
    )
}

export default Promocoes;