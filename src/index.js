import ReactDOM from 'react-dom';
import './index.css';
import ROUTING from './routes/routes';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(ROUTING, document.getElementById('root'));

serviceWorker.unregister();
