package controllers;

import filters.LogFilter;
import ninja.FilterWith;

/**
 * @author <a href="mailto:alexander.hanschke@techdev.de">Alexander Hanschke</a>
 */
@FilterWith(LogFilter.class)
public class BaseController {
}
