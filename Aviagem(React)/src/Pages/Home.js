import BuscaPassagem from "../Components/BuscaPassagem";

import "../Components/Assets/js/Carousel";
import Aproveite from "../Components/Assets/Imagens/aproveite.jpg"
import DicasMala from "../Components/Assets/Imagens/dicas de mala.png"
import DicasSegurança from "../Components/Assets/Imagens/Dicas de segurança.png"
import GuiaPassageiro from "../Components/Assets/Imagens/Guia do passageiro.png"
import "../Components/Assets/css/style.css"
import { useForm } from 'react-hook-form'
import CarouselTop from "../Components/CarouselTop";

const Home = () => {
    const { register, handleSubmit } = useForm()
    const cadastroNewsletter = (email) => {
        console.log(email)}
    

    return(
    <div>
        <BuscaPassagem/>
        <h3 style={{fontFamily:"Tommy, Cambria, Cochin, Georgia, Times, 'Times New Roman', serif"}}>Os mais buscados</h3>
        <CarouselTop></CarouselTop>
        <section class="row">
        <div class="col-12 col-lg-6" style={{padding:"50px 50px 30px 40px"}}>
      <div id="carouselId" class="carousel slide" data-bs-ride="carousel" style={{width:"100%"}}>
        <ol class="carousel-indicators">
          <li data-bs-target="#carouselId" data-bs-slide-to="0" class="active" aria-current="true" aria-label="First slide"></li>
          <li data-bs-target="#carouselId" data-bs-slide-to="1" aria-label="Second slide"></li>
          <li data-bs-target="#carouselId" data-bs-slide-to="2" aria-label="Third slide"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="carousel-item active">
            <img src={GuiaPassageiro} class="w-100 d-block" alt="First slide"/>
              <div class="carousel-caption d-none d-md-block">
              </div>
          </div>
          <div class="carousel-item">
           <img src={DicasSegurança} class="w-100 d-block" alt="Second slide"/>
            <div class="carousel-caption d-none d-md-block">
            </div>
          </div>
          <div class="carousel-item">
            <img src={DicasMala} class="w-100 d-block" alt="Third slide"/>
             <div class="carousel-caption d-none d-md-block">
             </div>
           </div>
        </div>
          <button class="carousel-control-prev" type="button" data-bs-target="#carouselId" data-bs-slide="prev">
           <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">P</span>
          </button>
          <button class="carousel-control-next" type="button" data-bs-target="#carouselId" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">N</span>
          </button>
      </div>
        </div>
          <div class="mb-3 col-11 col-lg-5 bg-transparent" style={{Margin:"20px", marginTop: "50px", paddingLeft: "0%" , paddingRight: "0%"}}>
          <img src={Aproveite} class="card-img-top" alt="..."/>
          <div class="card-footer">
            <p>Se você ainda não definiu o seu destino, talvez te interesse ver a nossa seção de ofertas.</p>
            <button type="button" class="btn btn-dark" href="Promoçoes.html" style={{width: "auto" }}>Ver ofertas</button>
          </div>
          </div>

        </section>
        <section class="container-cards">
          <div class="row">
            <div class="col-lg-3 mx-auto">
              <div class="form">
                <h4 class="newsletter">Assine nossa newsletter e receba as ofertas </h4>
                <form>
                  <div class="form-group">
                    <label for="formGroupExampleInput">Nome</label>
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Seu nome"{ ...register('nome') }/>
                  </div>
                  <div class="form-group">
                    <label for="formGroupExampleInput2">E-mail</label>
                    <input type="text" class="form-control" id="formGroupExampleInput2" placeholder=" aaaaaaaaa@seuemail.com"
                    { ...register('email') }/>
                  </div>
                </form>
                <button type="button" onClick={handleSubmit(cadastroNewsletter)}class="btn btn-primary mb-5 mt-3">Assinar</button>
              </div>
            </div>
                    <div class="col-lg-2 mx-auto">
                        <blockquote class="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div class="blockquote-custom-icon bg-info shadow-sm"><i class="bi bi-quote text-white"></i></div>
                            <p class="mb-0 mt-2 font-italic">"A agência é excelente, prestou total suporte a todas as necessidades que tive antes e durante a viagem."</p>
                            <div class="blockquote-footer pt-4 mt-4 border-top">Rodrigo Boots
                                <cite title="Source Title"> na viagem a Disney</cite>
                            </div>
                        </blockquote>
                    </div>
                    <div class="col-lg-2 mx-auto">
                        <blockquote class="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div class="blockquote-custom-icon bg-info shadow-sm"><i class="bi bi-quote  text-white"></i></div>
                            <p class="mb-0 mt-2 font-italic">"Minha experiência com agência, não poderia ter sido melhor, tive um ótimo atendimento pelo pessoal da Aviagem."</p>
                            <div class="blockquote-footer pt-4 mt-4 border-top">Joana Java
                                <cite title="Source Title"> na viagem ao Rio de Janeiro</cite>
                            </div>
                        </blockquote>
    
                    </div>
                    <div class="col-lg-2 mx-auto">
                        <blockquote class="blockquote blockquote-custom bg-white p-5 shadow rounded">
                            <div class="blockquote-custom-icon bg-info shadow-sm"><i class="bi bi-quote text-white"></i></div>
                            <p class="mb-0 mt-2 font-italic">"Foi a única que conseguiu todos os passeios que queríamos fazer, sem falar no ótimo atendimento."</p>
                            <div class="blockquote-footer pt-4 mt-4 border-top">João Node
                                <cite title="Source Title"> na viagem a Porto de Galinhas</cite>
                            </div>
                        </blockquote>
                    </div>
                
              
            
          </div>   
        </section>
        
    </div>
    )
}

export default Home;