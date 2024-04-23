import org.example.provider.Dollar;
import org.example.provider.Euro;
import org.example.service.Currencies;

module org.example.provider {
    requires org.example.service;
    provides Currencies with Euro, Dollar;
}