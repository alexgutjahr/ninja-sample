package filters;

import ninja.Context;
import ninja.Filter;
import ninja.FilterChain;
import ninja.Result;

/**
 * @author <a href="mailto:alexander.hanschke@techdev.de">Alexander Hanschke</a>
 */
public class LogFilter implements Filter {

    @Override
    public Result filter(FilterChain filterChain, Context context) {
        return filterChain.next(context);
    }
}
