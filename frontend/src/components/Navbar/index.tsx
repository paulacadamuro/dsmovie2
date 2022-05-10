import {ReactComponent as GitHubIcon} from 'asssets/img/github.svg';
import './styles.css';

function Navbar(){

    return(
    <header>
     <nav className="container">
      <div className="dsmovie-nav-content">
        <h1>DSMovie2</h1>
        <a href="https://github.com/paulacadamuro">
            <div className="dsmovie-contact-container">
              <GitHubIcon />
              <p className="dsmovie-contact-link">/paulacadamuro</p>
            </div>
        </a>         
      </div>
     </nav>
   </header>
    );
   
}

export default Navbar;