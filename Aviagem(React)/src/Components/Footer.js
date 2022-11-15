import Mastercard from "./Assets/Imagens/mc.png"
import Amex from "./Assets/Imagens/bandeira amex png.png"
import Elo from "./Assets/Imagens/elo 2.png"
import Visa from "./Assets/Imagens/visa.png"
import Boleto from "./Assets/Imagens/boleto.png"

const Footer = () => {
    return (
<div>
<footer class="text-center text-lg-start bg-light text-muted">
  <div class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
    <div class="me-5 d-none d-lg-block">
      <span>Aviagem nas redes sociais:</span>
    </div>
    <div>
      <a href="" class="me-4 text-reset"><i class="bi bi-facebook"></i></a>
      <a href="" class="me-4 text-reset"><i class="bi bi-twitter"></i></a>
      <a href="" class="me-4 text-reset"><i class="bi bi-google"></i></a>
      <a href="" class="me-4 text-reset"><i class="bi bi-instagram"></i></a>
      <a href="" class="me-4 text-reset"><i class="bi bi-linkedin"></i></a>
    </div>
  </div>
  <div class="">
    <div class="container text-center text-md-start mt-5">
     
      <div class="row mt-3">
  
        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">

          <h6 class="text-uppercase fw-bold mb-4">
            <i class="fas fa-gem me-3"></i>AViagem
          </h6>
          <p>
              Aviagem está presente no Brasil e mais de 100 países para que possamos fazer de sua viagem a melhor.
          </p>
        </div>
        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
          <h6 class="text-uppercase fw-bold mb-4">
            Termos
          </h6>
          <p>Condições de uso do site</p>
          <p>Condições Gerais</p>
          <p>Politica de privacidade</p>
        </div>

        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
          <h6 class="text-uppercase fw-bold mb-4">
            Formas de pagamentos
          </h6>
          <p><img src={Mastercard} class="text-reset"/>MasterCard</p>
          <p><img src={Amex}    class="text-reset" width="30"height="30"/> AmericanExpress</p>
          <p><img src={Elo} class="text-reset" width="30"height="30"/> Elo</p>
          <p><img src={Visa} class="text-reset" width="30"height="30"/> Visa</p>
          <p><img src={Boleto} class="text-reset" width="30"height="30"/> Boleto</p>
        </div>
        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
          <h6 class="text-uppercase fw-bold mb-4">Contato</h6>
          <p><i class="bi bi-house-fill"></i> Avenida Brasil 000- Rio de Janeiro - RJ</p>
          <p><i class="bi bi-envelope"></i>aviagemsuporte@aviagem.com</p>
          <p><i class="bi bi-telephone"></i> 080008080878808</p>
          <p><i class="bi bi-phone-fill"></i> (00)0079-2890019</p>
        </div>
      </div>
    </div>
  </div>
  <div class="text-center p-4" >
    © 2022 Copyright: AVIAGEMTURISMO
  </div>

      </footer>
</div>
    )
}
export default Footer;