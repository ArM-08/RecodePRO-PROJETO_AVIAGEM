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
import CardDestinos from "../Components/CardDestinos"

const Destinos = () => {
    return(
        <div>
            <BuscaPassagem>
            </BuscaPassagem>
            <section> 
            <div className="container-promo">
      <div className="row">
        <div className="promo col-12">
          <h1 className="tpromo">Destinos</h1>
          <p className="t2promo">Em meio a tantos lugares maravilhosos para viajar, fica até difícil escolher os melhores, por isso aqui você terá acesso a todos os destinos disponiveis seja internacional ou nacional.</p>
        </div>
      </div>
      
            </div>
          </section>
          <section>
            <div className="container">
              <h2 style={{fontFamily: "tommy;"}}>Nacionais</h2>
        <div className="row">
        <CardDestinos
        img={RiodeJaneiro}
        titulo={'Rio de Janeiro'}
        descricao={'O Rio de Janeiro, é a cidade brasileira mais conhecida no exterior tem a fama de possuir um povo alegre, ávido por sol, praia, futebol e samba..'}
        valor='R$ 400'/>
          <CardDestinos
        img={SaoPaulo}
        titulo={'São Paulo'}
        descricao={'Esta metrópole é efervescente, viva e dada a muitas metamorfoses. Sempre haverá uma novidade a ser descoberta.'}
        valor='R$ 400'/>
          <CardDestinos
        img={EspiritoSanto}
        titulo={'Espirito Santo'}
        descricao={'O Espírito Santo, estado da região Sudeste do Brasil, é conhecido por suas praias tropicais e áreas naturais montanhosas preservadas.'}
        valor='R$ 400'/>
        <CardDestinos
        img={Florianopolis}
        titulo={'Florianopolis'}
        descricao={'A combinação do número cabalístico “42 praias” com a expressão mágica “qualidade de vida” faz de Floripa um destino desejado tanto para passar férias quanto para viver.'}
        valor='R$ 400'/> 
         <CardDestinos
        img={Recife}
        titulo={'Recife'}
        descricao={'Uma das capitais mais vibrantes do Nordeste, Recife aposta em atrações culturais e gastronômicas.'}
        valor='R$ 400'/>
        <CardDestinos
        img={Manaus}
        titulo={'Manaus'}
        descricao={'Conhecer Manaus é se deslumbrar com as surpresas de uma região ímpar, onde a natureza impõe soberania incontestável.'}
        valor='R$ 400'/>
        <CardDestinos
        img={Brasilia}
        titulo={'Brasilia'}
        descricao={'Única cidade moderna do mundo a receber o título de Patrimônio Cultural da Humanidade, Brasília é peculiar sob todos os aspectos.'}
        valor='R$ 400'/>
        <CardDestinos
        img={Curitiba}
        titulo={'Curitiba'}
        descricao={'A cidade de Curitiba, capital do estado do Paraná, é conhecida pelo cuidado com o planejamento urbano, belas áreas verdes e um transporte público de qualidade.'}
        valor='R$ 400'
        />
        </div>
        <div className="row">
          <h2 style={{fontFamily: "tommy;"}}>Internacionais</h2>
        </div>
        <div className="row">
        <CardDestinos
        img={EstadosUnidos}
        titulo={'Estados Unidos'}
        descricao={'Nova York, um centro financeiro e cultural global, e a capital, Washington, DC.'}
        valor='R$ 400'
        />
        <CardDestinos
        img={França}
        titulo={'França'}
        descricao={'A França, na Europa Ocidental, tem cidades medievais, aldeias alpinas e praias mediterrâneas.'}
        valor='R$ 400'
        />
         <CardDestinos
        img={Italia}
        titulo={'Italia'}
        descricao={'A Itália, país europeu com uma longa costa mediterrânea, deixou uma marca poderosa na culinária e na cultura ocidentais.'}
        valor='R$ 400'
        />
         <CardDestinos
        img={Argentina}
        titulo={'Italia'}
        descricao={'A Argentina é um país da América do Sul com uma área extensa que abrange montanhas dos Andes, lagos glaciais e pradarias nos Pampas, ocupadas tradicionalmente por seu famoso gado.'}
        valor='R$ 400'
        />
        </div>
            </div>  
          </section>
        </div>
    )
}
export default Destinos;