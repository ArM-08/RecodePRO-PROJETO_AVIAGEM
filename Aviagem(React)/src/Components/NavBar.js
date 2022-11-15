import logo from './Assets/Imagens/pngwing.png'
const NavBar = () => {
    return(
        <div>
            <nav className="navbar navbar-expand-lg bg-danger">
                <div className="container-fluid">
                    <a className="navbar-brand" href="/"><img src={logo} width="100" height="75"/></a>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                            <li className="nav-item">
                            <a className="nav-link active" aria-current="page" href="/"> <b><b className="text-warning ">H</b>ome</b></a>
                            </li>
                            <li className="nav-item">
                            <a className="nav-link" href="/Destinos"><b><b className="text-warning">D</b>estinos</b></a>
                            </li>
                            <li className="nav-item">
                            <a className="nav-link" href="/promocoes"><b><b className="text-warning">P</b>romoções</b></a>
                            </li>
                            <li className="nav-item">
                            <a className="nav-link" href="/Contato"><b><b className="text-warning">C</b>ontato</b></a>
                            </li>
                        </ul>
                        <button type="button" className="btn btn-warning btn-round" data-toggle="modal" data-target="#loginModal">
                            Login
                        </button>
                        <div className="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div className="modal-dialog modal-dialog-centered" role="document">
                            <div className="modal-content">
                                <div className="modal-header border-bottom-0">
                                <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                </div>
                                <div className="modal-body">
                                <div className="form-title text-center">
                                    <h4>Login</h4>
                                </div>
                                <div className="d-flex flex-column text-center">
                                    <form>
                                    <div className="form-group p-2">
                                        <input type="email" className="form-control" id="email1"placeholder="Seu email..."/>
                                    </div>
                                    <div className="form-group p-2">
                                        <input type="password" className="form-control" id="password1" placeholder="Sua senha..."/>
                                    </div>
                                    <button type="button" className="btn btn-info btn-block btn-round">Login</button>
                                    </form>
                                    
                                    <div className="text-center delimiter">ou continue com o </div>
                                    <div className="d-flex justify-content-center social-buttons">
                                    <a className="btn btn-primary m-1"  href="#!" role="button"><i className="bi bi-google"></i></a>
                                    
                                    <a class="btn btn-primary m-1"  href="#!" role="button"><i className="bi bi-facebook"></i></a>
                                    
                                    <a class="btn btn-primary m-1"  href="#!" role="button"><i className="bi bi-linkedin"></i></a>
                                    </div>
                                </div>
                                </div>
                            
                                <div className="modal-footer d-flex justify-content-center">
                                <div className="signup-section">Não é um membro ainda? <a href="#a" className="text-info"> Crie sua conta</a>.</div>
                                </div>
                                </div>
                            </div>
                        </div>
                        </div>
                </div>
          
            </nav>
        </div>
    )
}
export default NavBar