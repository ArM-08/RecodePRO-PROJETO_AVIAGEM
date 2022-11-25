import BuscaPassagem from "../Components/BuscaPassagem";
import NavBar from './../Components/NavBar'
import "../Components/Assets/js/Carousel";
import Aproveite from "../Components/Assets/Imagens/aproveite.jpg"
import DicasMala from "../Components/Assets/Imagens/dicas de mala.png"
import DicasSegurança from "../Components/Assets/Imagens/Dicas de segurança.png"
import GuiaPassageiro from "../Components/Assets/Imagens/Guia do passageiro.png"
import "../Components/Assets/css/style.css"
import { useForm } from 'react-hook-form'
import CarouselTop from "../Components/CarouselTop";
import Footer from "../Components/Footer";
const Home = () => {
    const { register, handleSubmit } = useForm()
    const cadastroNewsletter = (email) => {
        console.log(email)}
    

    return(
    <div>
      <NavBar/>
        <BuscaPassagem/>
        <h3 style={{fontFamily:"Tommy, Cambria, Cochin, Georgia, Times, 'Times New Roman', serif"}}>Os mais buscados</h3>
        <CarouselTop></CarouselTop>
        <section className="row">
        <div className="col-12 col-lg-6" style={{padding:"50px 50px 30px 40px"}}>
      <div id="carouselId" className="carousel slide" data-bs-ride="carousel" style={{width:"100%"}}>
        <ol className="carousel-indicators">
          <li data-bs-target="#carouselId" data-bs-slide-to="0" className="active" aria-current="true" aria-label="First slide"></li>
          <li data-bs-target="#carouselId" data-bs-slide-to="1" aria-label="Second slide"></li>
          <li data-bs-target="#carouselId" data-bs-slide-to="2" aria-label="Third slide"></li>
        </ol>
        <div className="carousel-inner" role="listbox">
          <div className="carousel-item active">
            <img src={GuiaPassageiro} className="w-100 d-block" alt="First slide"/>
              <div className="carousel-caption d-none d-md-block">
              </div>
          </div>
          <div className="carousel-item">
           <img src={DicasSegurança} className="w-100 d-block" alt="Second slide"/>
            <div className="carousel-caption d-none d-md-block">
            </div>
          </div>
          <div className="carousel-item">
            <img src={DicasMala} className="w-100 d-block" alt="Third slide"/>
             <div className="carousel-caption d-none d-md-block">
             </div>
           </div>
        </div>
          <button className="carousel-control-prev" type="button" data-bs-target="#carouselId" data-bs-slide="prev">
           <span className="carousel-control-prev-icon" aria-hidden="true"></span>
            <span className="visually-hidden">P</span>
          </button>
          <button className="carousel-control-next" type="button" data-bs-target="#carouselId" data-bs-slide="next">
            <span className="carousel-control-next-icon" aria-hidden="true"></span>
            <span className="visually-hidden">N</span>
          </button>
      </div>
        </div>
          <div className="mb-3 col-11 col-lg-5 bg-transparent" style={{Margin:"20px", marginTop: "50px", paddingLeft: "0%" , paddingRight: "0%"}}>
          <img src={Aproveite} className="card-img-top" alt="..."/>
          <div className="cardD-body">
            <p>Se você ainda não definiu o seu destino, talvez te interesse ver a nossa seção de ofertas.</p>
            <button type="button" className="btn btn-dark" href="Promoçoes.html" style={{width: "auto" }}>Ver ofertas</button>
          </div>
          </div>

        </section>
        <section className="container-cards">
          <div className="row">
            <div className="col-lg-3 mx-auto">
              <div className="form">
                <h4 className="newsletter">Assine nossa newsletter e receba as ofertas </h4>
                <form>
                  <div className="form-group">
                    <label htmlFor="formGroupExampleInput">Nome</label>
                    <input type="text" className="form-control" id="formGroupExampleInput" placeholder="Seu nome"{ ...register('nome') }/>
                  </div>
                  <div className="form-group">
                    <label htmlFor="formGroupExampleInput2">E-mail</label>
                    <input type="text" className="form-control" id="formGroupExampleInput2" placeholder=" aaaaaaaaa@seuemail.com"
                    { ...register('email') }/>
                  </div>
                </form>
                <button type="button" onClick={handleSubmit(cadastroNewsletter)}className="btn btn-primary mb-5 mt-3">Assinar</button>
              </div>
            </div>
                    <div className="col-lg-2 mx-auto">
                        <blockquote className="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div className="blockquote-custom-icon bg-info shadow-sm"><i className="bi bi-quote text-white"></i></div>
                            <p className="mb-0 mt-2 font-italic">"A agência é excelente, prestou total suporte a todas as necessidades que tive antes e durante a viagem."</p>
                            <div className="blockquote-footer pt-4 mt-4 border-top">Rodrigo Boots
                                <cite title="Source Title"> na viagem a Disney</cite>
                            </div>
                        </blockquote>
                    </div>
                    <div className="col-lg-2 mx-auto">
                        <blockquote className="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div className="blockquote-custom-icon bg-info shadow-sm"><i className="bi bi-quote  text-white"></i></div>
                            <p className="mb-0 mt-2 font-italic">"Minha experiência com agência, não poderia ter sido melhor, tive um ótimo atendimento pelo pessoal da Aviagem."</p>
                            <div className="blockquote-footer pt-4 mt-4 border-top">Joana Java
                                <cite title="Source Title"> na viagem ao Rio de Janeiro</cite>
                            </div>
                        </blockquote>
    
                    </div>
                    <div className="col-lg-2 mx-auto">
                        <blockquote className="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div className="blockquote-custom-icon bg-info shadow-sm"><i className="bi bi-quote text-white"></i></div>
                            <p className="mb-0 mt-2 font-italic">"Foi a única que conseguiu todos os passeios que queríamos fazer, sem falar no ótimo atendimento."</p>
                            <div className="blockquote-footer pt-4 mt-4 border-top">João Node
                                <cite title="Source Title"> na viagem a Porto de Galinhas</cite>
                            </div>
                        </blockquote>
                    </div>
                
              
            
          </div>   
        </section>
        <Footer/>
    </div>
    )
}

export default Home;