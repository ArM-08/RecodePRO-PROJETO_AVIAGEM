import './style.css';
import Carrinho from './../Assets/Imagens/carrinho.png'
import Aviao from './../Assets/Imagens/aviao.png'
import Caderno from './../Assets/Imagens/caderno.png'
const SideBar = () => {
    return(
    

      <nav className="nav__cont">
        <ul className="nav">
          <li className="nav__items">
          <img src={Carrinho} className='logoCarrinho'/>
            <a href="">Vendas</a>
          </li>
          
          <li className="nav__items">
          <img src={Aviao} className='logoAviao'/>
            <a href="">Destinos</a>
          </li>
            
          <li className="nav__items">
          <img src={Caderno} className='logoCaderno'/>
           <a href="">Controle</a>
          </li>
            
          <a className='logLink'href='/'><button type="button" class="logout btn btn-dark">Sair</button></a>
              
        </ul>
      </nav>
      
    
    )
}

export default SideBar;